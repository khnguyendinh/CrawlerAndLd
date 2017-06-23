import GetListFilm.GetListFilms;
import Models.ItemListFilm;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    List<ItemListFilm> itemListFilms = new ArrayList<>();

//    http://www.url-encode-decode.com/
    //xpath
    public Main() {
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getListFilmsOneDay();

    }

    private void getListFilmsOneDay() {
        String urlListFilm = "https://chieuphimquocgia.com.vn/Film/BoxLichChieuPhimShowAll2?projectDate=24%2F06%2F2017+12%3A00%3A00+SA";
        String urlListFilm1 = "https://chieuphimquocgia.com.vn/Film/BoxLichChieuPhimShowAll2?projectDate=23%2F06%2F2017+12%3A00%3A00+SA";
        String urlListFilm2 = "https://chieuphimquocgia.com.vn/giai-ma-giac-mo-(-2d)---p-chi-tiet-film-7428";
        String urlListFilm3 = "https://chieuphimquocgia.com.vn/Film/BoxLichChieuPhimShowAll2?projectDate=25%2F06%2F2017+12%3A00%3A00+SA";
        itemListFilms = GetListFilms.getListFilmsOneDay(urlListFilm);
        try {
//            Document docFilm = Jsoup.connect(urlListFilm).timeout(20*1000).get();
            Document docFilm = Jsoup.connect(urlListFilm).get();
            Document docFilm1 = Jsoup.connect(urlListFilm1).get();
            Document docFilm2 = Jsoup.connect(urlListFilm3).get();
            System.out.println("=========================================");
//            System.out.println(docFilm);
//            System.out.println("=========================================");
//            System.out.println(docFilm1);
            System.out.println("=========================================");
            System.out.println(docFilm2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
