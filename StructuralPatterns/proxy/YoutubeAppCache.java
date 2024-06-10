public class YoutubeAppCache implements YoutubeLib{

    public String listVideoCache;
    public String videoInfoCache;
    public YoutubeApp appService;

    public YoutubeAppCache(YoutubeApp appService) {
        this.appService = appService;
    }

    public String listVideos() {
        if(listVideoCache == null) {
            this.listVideoCache = appService.listVideos();
        }

        return this.listVideoCache;
    }

    public String videoInfo() {
        if(this.videoInfoCache == null) {
            this.videoInfoCache = appService.videoInfo();
        }

        return this.videoInfoCache;
    }

}
