package com.cjj.kotlindemo.bo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Annotations {

    /**
     * count : 20
     * start : 0
     * total : 1962
     */

    private int count;
    private int start;
    private int total;
    private List<AnnotationsBean> annotations;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<AnnotationsBean> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<AnnotationsBean> annotations) {
        this.annotations = annotations;
    }

    public static class AnnotationsBean {
        /**
         * chapter :
         * book : {"rating":{"max":10,"numRaters":277915,"average":"8.6","min":0},"subtitle":"","author":["[日] 东野圭吾"],"pubdate":"2014-5","tags":[{"count":79949,"name":"东野圭吾","title":"东野圭吾"},{"count":44058,"name":"治愈","title":"治愈"},{"count":36796,"name":"小说","title":"小说"},{"count":35612,"name":"温暖","title":"温暖"},{"count":35037,"name":"日本","title":"日本"},{"count":30599,"name":"日本文学","title":"日本文学"},{"count":26039,"name":"東野圭吾","title":"東野圭吾"},{"count":18821,"name":"推理","title":"推理"}],"origin_title":"ナミヤ雑貨店の奇蹟","image":"https://img3.doubanio.com/view/subject/m/public/s27264181.jpg","binding":"精装","translator":["李盈春"],"catalog":"第一章 回答在牛奶箱里\n第二章 深夜的口琴声\n第三章 在思域车上等到天亮\n第四章 听着披头士默祷\n第五章 来自天上的祈祷","ebook_url":"https://read.douban.com/ebook/36103930/","pages":"291","images":{"small":"https://img3.doubanio.com/view/subject/s/public/s27264181.jpg","large":"https://img3.doubanio.com/lpic/s27264181.jpg","medium":"https://img3.doubanio.com/view/subject/m/public/s27264181.jpg"},"alt":"https://book.douban.com/subject/25862578/","id":"25862578","publisher":"南海出版公司","isbn10":"7544270874","isbn13":"9787544270878","title":"解忧杂货店","url":"https://api.douban.com/v2/book/25862578","alt_title":"ナミヤ雑貨店の奇蹟","author_intro":"东野圭吾\n日本著名作家。\n1985年，《放学后》获第31届江户川乱步奖，开始专职写作；\n1999年，《秘密》获第52届日本推理作家协会奖；\n2005年出版的《嫌疑人X的献身》史无前例地同时获得第134届直木奖、第6届本格推理小说大奖，以及年度三大推理小说排行榜第1名；\n2008年，《流星之绊》获第43届新风奖；\n2009年出版的《新参者》获两大推理小说排行榜年度第1名；\n2012年，《解忧杂货店》获第7届中央公论文艺奖。\n2014年，《祈りの幕が下りる時》（暂译《祈祷落幕时》）获第48届吉川英治文学奖。","summary":"现代人内心流失的东西，这家杂货店能帮你找回\u2014\u2014\n僻静的街道旁有一家杂货店，只要写下烦恼投进卷帘门的投信口，第二天就会在店后的牛奶箱里得到回答。\n因男友身患绝症，年轻女孩静子在爱情与梦想间徘徊；克郎为了音乐梦想离家漂泊，却在现实中寸步难行；少年浩介面临家庭巨变，挣扎在亲情与未来的迷茫中\u2026\u2026\n他们将困惑写成信投进杂货店，随即奇妙的事情竟不断发生。\n生命中的一次偶然交会，将如何演绎出截然不同的人生？\n如今回顾写作过程，我发现自己始终在思考一个问题：站在人生的岔路口，人究竟应该怎么做？我希望读者能在掩卷时喃喃自语：我从未读过这样的小说。\u2014\u2014东野圭吾","ebook_price":"13.00","series":{"id":"868","title":"新经典文库·东野圭吾作品"},"price":"39.50元"}
         * author_user : {"name":"爱撒娇的猪兔兔","is_banned":false,"is_suicide":false,"url":"https://api.douban.com/v2/user/62556002","avatar":"https://img1.doubanio.com/icon/user_normal.jpg","uid":"62556002","alt":"https://www.douban.com/people/62556002/","type":"user","id":"62556002","large_avatar":"https://img3.doubanio.com/icon/user_large.jpg"}
         * privacy : 2
         * abstract_photo :
         * abstract : 人与人之间情断义绝，并不需要什么具体的理由。就算表面上有，也很可能只是心离开的结果，事后才编造出的借口而已。因为倘若心没有离开，当将会导致关系破裂的事态发生时，理应有人努力去挽救。如果没有，说明其...
         * summary : 人与人之间情断义绝，并不需要什么具体的理由。就算表面上有，也很可能只是心离开的结果，事后才编造出的借口而已。因为倘若心没有离开，当将会导致关系破裂的事态发生时，理应有人努力去挽救。如果没有，说明其...
         * content : 人与人之间情断义绝，并不需要什么具体的理由。就算表面上有，也很可能只是心离开的结果，事后才编造出的借口而已。因为倘若心没有离开，当将会导致关系破裂的事态发生时，理应有人努力去挽救。如果没有，说明其实关系早已破裂。
         * photos : {}
         * last_photo : 0
         * comments_count : 102
         * hasmath : false
         * book_id : 25862578
         * time : 2018-04-12 20:01:17
         * author_id : 62556002
         * id : 32072276
         * page_no : 175
         */

        private String chapter;
        private BookBean book;
        private AuthorUserBean author_user;
        private int privacy;
        private String abstract_photo;
        @SerializedName("abstract")
        private String abstractX;
        private String summary;
        private String content;
        private PhotosBean photos;
        private int last_photo;
        private int comments_count;
        private boolean hasmath;
        private String book_id;
        private String time;
        private String author_id;
        private String id;
        private int page_no;

        public String getChapter() {
            return chapter;
        }

        public void setChapter(String chapter) {
            this.chapter = chapter;
        }

        public BookBean getBook() {
            return book;
        }

        public void setBook(BookBean book) {
            this.book = book;
        }

        public AuthorUserBean getAuthor_user() {
            return author_user;
        }

        public void setAuthor_user(AuthorUserBean author_user) {
            this.author_user = author_user;
        }

        public int getPrivacy() {
            return privacy;
        }

        public void setPrivacy(int privacy) {
            this.privacy = privacy;
        }

        public String getAbstract_photo() {
            return abstract_photo;
        }

        public void setAbstract_photo(String abstract_photo) {
            this.abstract_photo = abstract_photo;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public PhotosBean getPhotos() {
            return photos;
        }

        public void setPhotos(PhotosBean photos) {
            this.photos = photos;
        }

        public int getLast_photo() {
            return last_photo;
        }

        public void setLast_photo(int last_photo) {
            this.last_photo = last_photo;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public boolean isHasmath() {
            return hasmath;
        }

        public void setHasmath(boolean hasmath) {
            this.hasmath = hasmath;
        }

        public String getBook_id() {
            return book_id;
        }

        public void setBook_id(String book_id) {
            this.book_id = book_id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getPage_no() {
            return page_no;
        }

        public void setPage_no(int page_no) {
            this.page_no = page_no;
        }

        public static class BookBean {
            /**
             * rating : {"max":10,"numRaters":277915,"average":"8.6","min":0}
             * subtitle :
             * author : ["[日] 东野圭吾"]
             * pubdate : 2014-5
             * tags : [{"count":79949,"name":"东野圭吾","title":"东野圭吾"},{"count":44058,"name":"治愈","title":"治愈"},{"count":36796,"name":"小说","title":"小说"},{"count":35612,"name":"温暖","title":"温暖"},{"count":35037,"name":"日本","title":"日本"},{"count":30599,"name":"日本文学","title":"日本文学"},{"count":26039,"name":"東野圭吾","title":"東野圭吾"},{"count":18821,"name":"推理","title":"推理"}]
             * origin_title : ナミヤ雑貨店の奇蹟
             * image : https://img3.doubanio.com/view/subject/m/public/s27264181.jpg
             * binding : 精装
             * translator : ["李盈春"]
             * catalog : 第一章 回答在牛奶箱里
             * 第二章 深夜的口琴声
             * 第三章 在思域车上等到天亮
             * 第四章 听着披头士默祷
             * 第五章 来自天上的祈祷
             * ebook_url : https://read.douban.com/ebook/36103930/
             * pages : 291
             * images : {"small":"https://img3.doubanio.com/view/subject/s/public/s27264181.jpg","large":"https://img3.doubanio.com/lpic/s27264181.jpg","medium":"https://img3.doubanio.com/view/subject/m/public/s27264181.jpg"}
             * alt : https://book.douban.com/subject/25862578/
             * id : 25862578
             * publisher : 南海出版公司
             * isbn10 : 7544270874
             * isbn13 : 9787544270878
             * title : 解忧杂货店
             * url : https://api.douban.com/v2/book/25862578
             * alt_title : ナミヤ雑貨店の奇蹟
             * author_intro : 东野圭吾
             * 日本著名作家。
             * 1985年，《放学后》获第31届江户川乱步奖，开始专职写作；
             * 1999年，《秘密》获第52届日本推理作家协会奖；
             * 2005年出版的《嫌疑人X的献身》史无前例地同时获得第134届直木奖、第6届本格推理小说大奖，以及年度三大推理小说排行榜第1名；
             * 2008年，《流星之绊》获第43届新风奖；
             * 2009年出版的《新参者》获两大推理小说排行榜年度第1名；
             * 2012年，《解忧杂货店》获第7届中央公论文艺奖。
             * 2014年，《祈りの幕が下りる時》（暂译《祈祷落幕时》）获第48届吉川英治文学奖。
             * summary : 现代人内心流失的东西，这家杂货店能帮你找回——
             * 僻静的街道旁有一家杂货店，只要写下烦恼投进卷帘门的投信口，第二天就会在店后的牛奶箱里得到回答。
             * 因男友身患绝症，年轻女孩静子在爱情与梦想间徘徊；克郎为了音乐梦想离家漂泊，却在现实中寸步难行；少年浩介面临家庭巨变，挣扎在亲情与未来的迷茫中……
             * 他们将困惑写成信投进杂货店，随即奇妙的事情竟不断发生。
             * 生命中的一次偶然交会，将如何演绎出截然不同的人生？
             * 如今回顾写作过程，我发现自己始终在思考一个问题：站在人生的岔路口，人究竟应该怎么做？我希望读者能在掩卷时喃喃自语：我从未读过这样的小说。——东野圭吾
             * ebook_price : 13.00
             * series : {"id":"868","title":"新经典文库·东野圭吾作品"}
             * price : 39.50元
             */

            private RatingBean rating;
            private String subtitle;
            private String pubdate;
            private String origin_title;
            private String image;
            private String binding;
            private String catalog;
            private String ebook_url;
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
            private String ebook_price;
            private SeriesBean series;
            private String price;
            private List<String> author;
            private List<TagsBean> tags;
            private List<String> translator;

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

            public String getEbook_url() {
                return ebook_url;
            }

            public void setEbook_url(String ebook_url) {
                this.ebook_url = ebook_url;
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

            public String getEbook_price() {
                return ebook_price;
            }

            public void setEbook_price(String ebook_price) {
                this.ebook_price = ebook_price;
            }

            public SeriesBean getSeries() {
                return series;
            }

            public void setSeries(SeriesBean series) {
                this.series = series;
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

            public List<String> getTranslator() {
                return translator;
            }

            public void setTranslator(List<String> translator) {
                this.translator = translator;
            }

            public static class RatingBean {
                /**
                 * max : 10
                 * numRaters : 277915
                 * average : 8.6
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
                 * small : https://img3.doubanio.com/view/subject/s/public/s27264181.jpg
                 * large : https://img3.doubanio.com/lpic/s27264181.jpg
                 * medium : https://img3.doubanio.com/view/subject/m/public/s27264181.jpg
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

            public static class SeriesBean {
                /**
                 * id : 868
                 * title : 新经典文库·东野圭吾作品
                 */

                private String id;
                private String title;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class TagsBean {
                /**
                 * count : 79949
                 * name : 东野圭吾
                 * title : 东野圭吾
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

        /**
         * "name":"爱撒娇的猪兔兔",
         * 　　　　　　　　"is_banned":false,
         * 　　　　　　　　"is_suicide":false,
         * 　　　　　　　　"url":"https://api.douban.com/v2/user/62556002",
         * 　　　　　　　　"avatar":"https://img1.doubanio.com/icon/user_normal.jpg",
         * 　　　　　　　　"uid":"62556002",
         * 　　　　　　　　"alt":"https://www.douban.com/people/62556002/",
         * 　　　　　　　　"type":"user",
         * 　　　　　　　　"id":"62556002",
         * 　　　　　　　　"large_avatar":"https://img3.doubanio.com/icon/user_large.jpg"
         */

        public static class AuthorUserBean {
            private String name;
            private boolean is_banned;
            private boolean is_suicide;
            private String url;
            private String avatar;
            private String uid;
            private String alt;
            private String type;
            private String id;
            private String large_avatar;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isIs_banned() {
                return is_banned;
            }

            public void setIs_banned(boolean is_banned) {
                this.is_banned = is_banned;
            }

            public boolean isIs_suicide() {
                return is_suicide;
            }

            public void setIs_suicide(boolean is_suicide) {
                this.is_suicide = is_suicide;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLarge_avatar() {
                return large_avatar;
            }

            public void setLarge_avatar(String large_avatar) {
                this.large_avatar = large_avatar;
            }
        }

        public static class PhotosBean {
        }
    }
}
