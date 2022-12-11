public class GarbageCollectorDemo {
    public String temp = "qwertyuiopasdfghjklzxcvbnm";
    int[] i = new int[1000];

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long memoryBeforeObjectCreation = r.freeMemory();
        GarbageCollectorDemo g = new GarbageCollectorDemo();
        long memoryAfterObjectCreation = r.freeMemory();
        g = null;
        long memoryAfterObjectSetToNull = r.freeMemory();
        r.gc();
        long memoryAfterGarbageCollection = r.freeMemory();
        long memoryFreedbyGarbageCollector = memoryAfterObjectSetToNull - memoryAfterGarbageCollection;
        System.out.println("Memory before object creation: " + memoryBeforeObjectCreation);
        System.out.println("Memory after object creation: " + memoryAfterObjectCreation);
        System.out.println("Memory after object set to null: " + memoryAfterObjectSetToNull);
        System.out.println("Memory after garbage collection: " + memoryAfterGarbageCollection);
        System.out.println("Memory Freed by Garbage Collector " + memoryFreedbyGarbageCollector);
    }
}
