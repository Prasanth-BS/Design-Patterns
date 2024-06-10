public class Main {
    public static void main(String args[]) {
        YoutubeLib youtubeApp = new YoutubeApp();
        YoutubeLib youtubeAppCache = new YoutubeAppCache(youtubeApp);

        youtubeAppCache.listVideos();
        youtubeAppCache.videoInfo(1);
    }
}
