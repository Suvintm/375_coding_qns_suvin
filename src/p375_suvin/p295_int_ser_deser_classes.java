//295) Create interfaces "Serializable" and "Deserializable" with methods "serialize()" and "deserialize()". Implement them in classes representing a file and a database.

package p375_suvin;

interface SerializableInt { void serialize(); }
interface DeserializableInt { void deserialize(); }

class DataFile implements SerializableInt {
    public void serialize() { System.out.println("Serializing file data..."); }
}

public class p295_int_ser_deser_classes {
    public static void main(String[] args) {
        System.out.println("Serialization interfaces created.");
    }
}

//output
//Serialization interfaces created.
