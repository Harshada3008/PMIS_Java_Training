package Day7;

import java.util.Scanner;

abstract class Media {
    String title;

    Media(String title) {
        this.title = title;
    }

    abstract String play();
}

class Song extends Media {
    Song(String title) {
        super(title);
    }

    @Override
    String play() {
        return "Playing song: " + title;
    }
}

class Video extends Media {
    Video(String title) {
        super(title);
    }

    @Override
    String play() {
        return "Playing video: " + title;
    }
}

class Podcast extends Media {
    Podcast(String title) {
        super(title);
    }

    @Override
    String play() {
        return "Playing podcast: " + title;
    }
}

public class HackerRank3rdEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mediaType = sc.nextLine();
        String title = sc.nextLine();

        Media media;

        if (mediaType.equals("Song")) {
            media = new Song(title);
        } else if (mediaType.equals("Video")) {
            media = new Video(title);
        } else if (mediaType.equals("Podcast")) {
            media = new Podcast(title);
        } else {
            System.out.println("Unknown media type.");
            sc.close();
            return;
        }

        System.out.println(media.play());

        sc.close();
    }
}