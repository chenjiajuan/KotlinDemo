package com.cjj.kotlindemo.bo;

import java.util.List;

/**
 * Created by chenjiajuan on 2018/4/13.
 */

public class BookDetail {

    /**
     * rating : {"max":10,"numRaters":7236,"average":"8.3","min":0}
     * subtitle :
     * author : ["墨香铜臭"]
     * pubdate : 2016-12-8
     * tags : [{"count":1842,"name":"耽美","title":"耽美"},{"count":1383,"name":"好书，值得一读","title":"好书，值得一读"},{"count":1324,"name":"耽美古风","title":"耽美古风"},{"count":1279,"name":"墨香铜臭","title":"墨香铜臭"},{"count":1135,"name":"古风","title":"古风"},{"count":1047,"name":"BL","title":"BL"},{"count":881,"name":"重生","title":"重生"},{"count":848,"name":"小说","title":"小说"}]
     * origin_title :
     * image : https://img1.doubanio.com/view/subject/m/public/s28589577.jpg
     * binding : 平装
     * translator : []
     * catalog : 重生第一，泼野第二，骄矜第三，雅骚第四，阳阳第五，阴鸷第六，朝露第七，草木第八，佼僚第九，狡童第十，绝勇第十一，三毒第十二，风邪第十三，优柔第十四，将离第十五，桀骜第十六，汉广第十七，夜奔第十八，丹心第十九，寤寐第二十，恨生第二十一，藏锋第二十二，忘羡第二十三
     * pages :
     * images : {"small":"https://img1.doubanio.com/view/subject/s/public/s28589577.jpg","large":"https://img1.doubanio.com/lpic/s28589577.jpg","medium":"https://img1.doubanio.com/view/subject/m/public/s28589577.jpg"}
     * alt : https://book.douban.com/subject/26763013/
     * id : 26763013
     * publisher : 平心工作室
     * isbn10 : 7035450890
     * isbn13 : 9787035450895
     * title : 魔道祖师
     * url : https://api.douban.com/v2/book/26763013
     * alt_title :
     * author_intro :
     * summary : 前世的魏无羡万人唾骂，声名狼藉。 被护持一生的师弟带人端了老巢， 纵横一世，死无全尸。 曾掀起腥风血雨的一代魔道祖师，重生成了一个…… 脑残。 还特么是个人人喊打的断袖脑残！ 我见诸君多有病，料诸君见我应如是。 但修鬼道不修仙，任你千军万马，十方恶霸，九州奇侠，高岭之花， 但凡化为一抔黄土，统统收归旗下，为我所用，供我驱策！ 高贵冷艳闷骚攻×邪魅狂狷风骚受
     * price :
     */

    private RatingBean rating;
    private String subtitle;
    private String pubdate;
    private String origin_title;
    private String image;
    private String binding;
    private String catalog;
    private String pages;
    private ImagesBean images;
    private String alt;
    private String id;
    private String publisher;
    private String isbn10;
    private String isbn13;
    private String title;
    private String url;
    private String alt_title;
    private String author_intro;
    private String summary;
    private String price;
    private List<String> author;
    private List<TagsBean> tags;
    private List<?> translator;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getOrigin_title() {
        return origin_title;
    }

    public void setOrigin_title(String origin_title) {
        this.origin_title = origin_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt_title() {
        return alt_title;
    }

    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<?> getTranslator() {
        return translator;
    }

    public void setTranslator(List<?> translator) {
        this.translator = translator;
    }

    public static class RatingBean {
        /**
         * max : 10
         * numRaters : 7236
         * average : 8.3
         * min : 0
         */

        private int max;
        private int numRaters;
        private String average;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getNumRaters() {
            return numRaters;
        }

        public void setNumRaters(int numRaters) {
            this.numRaters = numRaters;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img1.doubanio.com/view/subject/s/public/s28589577.jpg
         * large : https://img1.doubanio.com/lpic/s28589577.jpg
         * medium : https://img1.doubanio.com/view/subject/m/public/s28589577.jpg
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class TagsBean {
        /**
         * count : 1842
         * name : 耽美
         * title : 耽美
         */

        private int count;
        private String name;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
