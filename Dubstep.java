import com.sun.deploy.util.StringUtils;

/**
 * Created by Eugene on 12/20/2017.
 */
public class Dubstep {
    public static String SongDecoder (String song)
    {
        song=song.replace("WUB"," ");
        song=song.replaceAll("\\s+"," ");
        song=song.trim();
        return song;
    }
    //better solution: return song.replaceAll("(WUB)+", " ").trim();

}
