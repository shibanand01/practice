interface Playable {
    void play();
}
class Music implements Playable {
    public void play()
    {
        System.out.println("Music Playing");
    }
}
class Video implements Playable{
    public void play()
    {
        System.out.println("Video Playing");
    }
}
class Driver{
    public static void main(String[] args) {
        Playable p1 = new Music();
        Playable p2 = new Video();

        p1.play();
        p2.play();
    }
}
