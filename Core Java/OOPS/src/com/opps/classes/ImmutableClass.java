package com.opps.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*->Immutable classes:- These are the classes whose instances are immutable object.
->Immutable Objects :- Immutable Objects are the object that can't be changed once they are created.
Examples of Immutable classes in Java :- String, Integer, Double, Long, LocaleDateTime, Big Decimal.

Rules to create an immutable class.
1.Create class as final because:-
    -->This will prevent from inheritance because a final class can't have a subclass.
    --> Final assigned only once.
2.Make variable/fields/data members as private final.
    -->Because private field can't be accessed outside of class.
    -->If filed are final they can't be reassigned using other methods or reflection apis.
3.Do not create any setter methods.
4.Initialized the field with constructor only.
*/
public final class ImmutableClass {
    private final int id;
    private final String dataSourceName;
    private final String url;
    //Until here it is immutable.
    private List<String> connections;

    public ImmutableClass(int id, String dataSourceName, String url,List<String> connections) {
        this.id = id;
        this.dataSourceName = dataSourceName;
        this.url = url;
/*        List<String> listOfConnections = new ArrayList<>();
        listOfConnections.addAll(connections);
        this.connections = listOfConnections;*/
        this.connections = List.copyOf(connections);//This will return the immutable list.
        //But if

    }
    public int getId() {
        return id;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getConnections() {
        return connections;
    }
}

class MainClas{
    public static void main(String[] args){
        List<String> connections = new ArrayList<>();
        connections.add("My Connection 1");
        connections.add("My Connection 2");
        connections.add("My Connection 3");
        connections.add("My Connection 4");

        ImmutableClass immutableClass = new ImmutableClass(
                1,"My Database source","http://www.test.com",connections);
        System.out.println("Id: " +immutableClass.getId() + ", Database Name:- " +
                immutableClass.getDataSourceName() + ", Database URL:- " + immutableClass.getUrl() +
                ", List of connections :- " + immutableClass.getConnections().toString());
        //Output:- Id: 1, Database Name:- My Database source, Database URL:- http://www.test.com,
        // List of connections :- [My Connection 1, My Connection 2, My Connection 3, My Connection 4]
        //Break Point 1.
        connections.add("My Connection 5");
        System.out.println("Id: " +immutableClass.getId() + ", Database Name:- " +
                immutableClass.getDataSourceName() + ", Database URL:- " + immutableClass.getUrl() +
                ", List of connections :- " + immutableClass.getConnections().toString());

        /*--> Output:- Id: 1, Database Name:- My Database source, Database URL:- http://www.test.com,
        List of connections :- [My Connection 1, My Connection 2, My Connection 3, My Connection 4, My Connection 5]
        --> You can see here the list of connections has changed but as per the rules the immutable object
         can't be changed once they are created.
        --> This happened because immutableClass.getConnections() == connections (True) because
         they are pointing the same memory location(have same hashcode/reference).
        --> To solve this we will have to create the new list of object with same data.
         this.connections = connections; will be modified as
         this.connections = List.copyOf(connections); inside the constructor.*/
        System.out.println("connection == immutableClass.getConnections():- " +
                (connections == immutableClass.getConnections()));
//        connection == immutableClass.getConnections():- false because they are having
//        the different hashCode
        System.out.println("connection HasHCode :-  "+ connections.hashCode() +
                " immutableClass.getConnections() HashCode:- " +
                immutableClass.getConnections().hashCode());
        //connection HasHCode :-  -1038330492 immutableClass.getConnections() HashCode:- 1063181379

        //Break Point 3.
        immutableClass.getConnections().add("My Connection 6");
        System.out.println("Id: " +immutableClass.getId() + ", Database Name:- " +
                immutableClass.getDataSourceName() + ", Database URL:- " + immutableClass.getUrl() +
                ", List of connections :- " + immutableClass.getConnections().toString());
        /*List<String> listOfConnections = new ArrayList<>();
                listOfConnections.addAll(connections);
                this.connections = listOfConnections;
        If you write this in your constructor then in this case
        connections.add("My Connection 5"); will not modify but
        by this immutableClass.getConnections().add("My Connection 6"); list will be modified.
        So to overcome both break points use List.copyOf() method logic because:-
            -->This will return a new immutable list
            -->immutableClass.getConnections().add("My Connection 6"); will throw
            java.lang.UnsupportedOperationException
            -->connections.add("My Connection 5"); will not modify the list.
        */
        /*Why we need them:-
        1.Thread safety.
        2.String Pool safety
        3.Hashcode
        4.Security (DB, files, class loading)*/
    }
}
