package Tugas_kelompok6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Task> tasks;
        System.out.println("=====Menu struktur data=====");
        System.out.println("1. LinkedList");
        System.out.println("2. Stack");
        System.out.println("3. Queue");
        System.out.print("Pilih : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                tasks = new LinkedList<>();
                break;
            case 2:
                tasks = new Stack<>();
                break;
            case 3:
                tasks = new LinkedList<>(); // Queue dengan LinkedList
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        TaskList taskList = new TaskList(tasks);

        while (true) {
            System.out.println("\n=======Menu======= ");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Daftar");
            System.out.println("4. Keluar");
            System.out.print("pilihan : ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Masukkan judul tugas: ");
                    String judul = scanner.next();
                    System.out.print("Masukkan deskripsi tugas: ");
                    String deskripsi = scanner.next();
                    taskList.addTask(new Task(judul, deskripsi));
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Daftar tugas kosong!");
                    } else {
                        System.out.println("Pilih tugas untuk dihapus (masukkan nomor):");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i).getJudul());
                        }
                        System.out.println("Masukkan nomor : ");
                        int index = scanner.nextInt() - 1;
                        taskList.deleteTask(tasks.get(index));
                    }
                    break;
                case 3:
                    taskList.displayTask();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}