package Tugas_kelompok6;

public class Task {
    private String judul;
    private String deskripsi;

    public Task(String judul, String deskripsi){
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public String getJudul(){
        return judul;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    @Override
    public String toString(){
        return "Task{" +
                "judul='" + judul + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                '}';
    }
}
