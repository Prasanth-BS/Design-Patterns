public class YoutubeApp implements YoutubeLib{
    public String listVideos() {
        System.out.println("")
        return "List of all Youtube videos";
    }

    public String videoInfo(int VideoID) {
        System.out.println("Some cpu hectic task the brings info of a video");
        return "Info of the video"
    }
}
