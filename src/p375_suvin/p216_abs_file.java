//216) Write an abstract class "File" with abstract methods "open" and "close". Implement it in subclasses "TextFile" and "ImageFile".

package p375_suvin;

abstract class FileAbs {
    abstract void open();
    abstract void close();
}

class TextFile extends FileAbs {
    void open() { System.out.println("Opening Text File"); }
    void close() { System.out.println("Closing Text File"); }
}

class ImageFile extends FileAbs {
    void open() { System.out.println("Opening Image File"); }
    void close() { System.out.println("Closing Image File"); }
}

public class p216_abs_file {
    public static void main(String[] args) {
        FileAbs f = new TextFile();
        f.open();
        f.close();
    }
}

//output
//Opening Text File
//Closing Text File
