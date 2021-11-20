package spec;

public class SpecificationManager {
    private static StorageSpecification storageSpecification;

    public static void registerExporter(StorageSpecification storagespecification) {
        storageSpecification = storagespecification;
    }

    public static StorageSpecification getSpecification(String fileName) {
        storageSpecification.setFileName(fileName);
        return storageSpecification;
    }
}
