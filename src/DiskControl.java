import java.io.IOException;

public class DiskControl {

    public static void main(String[] args) {
        // Ścieżka do pliku nircmd.exe na Pulpicie
        String nircmdPath = "C:\\Users\\4bT_1\\Desktop\\nircmd.exe";

        // Litera napędu, którą chcesz otworzyć/zamknąć (może to być np. D:, E:, itp.)
        String driveLetter = "E:";

        // Pętla do otwierania i zamykania napędu co 2 sekundy
        while (true) {
            try {
                // Otwórz napęd DVD
                openDrive(nircmdPath, driveLetter);
                // Czekaj 2 sekundy
                Thread.sleep(500);

                // Zamknij napęd DVD
                closeDrive(nircmdPath, driveLetter);
                // Czekaj 2 sekundy
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Metoda do otwierania napędu
    public static void openDrive(String nircmdPath, String driveLetter) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(nircmdPath, "cdrom", "open", driveLetter);
            Process process = processBuilder.start();
            process.waitFor(); // Czekaj na zakończenie procesu
            System.out.println("Napęd " + driveLetter + " otwarty.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Metoda do zamykania napędu
    public static void closeDrive(String nircmdPath, String driveLetter) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(nircmdPath, "cdrom", "close", driveLetter);
            Process process = processBuilder.start();
            process.waitFor(); // Czekaj na zakończenie procesu
            System.out.println("Napęd " + driveLetter + " zamknięty.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
