public class main {
    public static void main(String[] args) {
        Library a = new Library();
        Library b = new Library();

        a.fname = "Kaghazgaran";
        a.bname = "Harry Potter";
        a.author = "J K Rowling";

        b.fname = "Qorbani";
        b.bname = "Divergent";
        b.author = "Veronica Roth";

        a.len();
        a.ret();
        b.len();
        b.ret();
    }
}