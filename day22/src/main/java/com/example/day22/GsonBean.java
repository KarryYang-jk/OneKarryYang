package com.example.day22;

import java.io.Serializable;
import java.util.List;

public class GsonBean implements Serializable{
    /**
     * code : 0000
     * message : 棣栭〉鏁版嵁
     * ggBean : [{"ggIma_url":"http://106.13.63.54:8080/sys/image/o.jpg","gg_title":"杩欐槸绗竴寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/p.jpg","gg_title":"杩欐槸绗簩寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/q.jpg","gg_title":"杩欐槸绗笁寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/r.jpg","gg_title":"杩欐槸绗洓寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/s.jpg","gg_title":"杩欐槸绗簲寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/t.jpg","gg_title":"杩欐槸绗叚寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/u.jpg","gg_title":"杩欐槸绗竷寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/v.jpg","gg_title":"杩欐槸绗叓寮犲浘","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"}]
     * hxListBeans : [{"shop_content":"杩欐槸涓\u20ac涓數鍚归锛屾礂瀹屽ご鍙戯紝鍙互鍚瑰共澶村彂锛岀櫧澶╃敤锛屾櫄涓婄敤锛屼粈涔堥\u20ac傚悎閮藉彲浠ョ敤锛岃\u20ac屼笖杩樹究瀹溿\u20ac備富瑕佹槸鑰佸皯鐨嗗疁鍟�","shop_ListingTime":"1563779867","shop_title":"鐢靛惞椋�","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/l.jpg"},{"shop_content":"鏂囧叿鐩掓槸灞辫胺閭伓鏃跺\u20ac欏緱蹇呭鐗╁搧锛屽彲浠ヨ涓\u20ac浜涚瀛楋紝娓竵锛屾瘺绗旂瓑涓\u20ac浜涘涔犵敤鍝侊紝浣嗘槸涓嶈兘鐢ㄦ潵瑁呬功锛屽洜涓鸿涓嶄笅","shop_ListingTime":"1563779867","shop_title":"鏂囧叿鐩�","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/c.jpg"},{"shop_content":"2B閾呯瑪鏄敤鏉ュ啓瀛楋紝鐢荤敾锛岀敤寰楅\u20ac傚悎锛岄渶瑕佸ぇ瀹惰嚜宸卞墛閾呯瑪锛屾瘮杈冮夯鐑︼紝涓嶈繃涓轰簡瀹夊叏璧疯锛屽彲浠ヨ鐩戞姢浜哄府蹇欏晩","shop_ListingTime":"1563779867","shop_title":"閾呯瑪","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/a.jpg"},{"shop_content":"鐢佃剳鏄挶浠綋浠婄ぞ浼氫笉鍙垨缂哄緱涓\u20ac涓墿鍝侊紝鍙互鑱婂ぉ锛岀湅瑙嗛锛屾墦娓告垙锛岃繕鍙互璋唬鐮侊紝瀛︿範锛屼絾鏄笉鑳芥场姘�","shop_ListingTime":"1563779867","shop_title":"鐢佃剳","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/b.jpg"},{"shop_content":"閿洏杩欎釜涓滆タ锛屾槸缁欑數鑴戠敤寰楋紝鍙板紡鏈哄鏋滄病鏈夐敭鐩樺緱璇濓紝灏辨病娉曡緭鍏ヤ笢瑗匡紝灏辨瘮杈冨按灏紝娌℃硶鑱婂ぉ锛屾病娉曟墦娓告垙锛屾病娉曞涔狅紝鏈\u20ac閲嶈寰楁槸娌℃硶鍐欎唬鐮�","shop_ListingTime":"1563779867","shop_title":"閿洏","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/d.jpg"},{"shop_content":"鍚瓕濡傛灉闇\u20ac瑕佹晥鏋滃ソ涓\u20ac鐐瑰緱璇濓紝灏遍渶瑕佸鎺ラ煶绠憋紝浣嗘槸鍗拌薄鏈夊ぇ鐨勶紝鏈夊皬鐨勶紝杩樻湁寰堝棰滆壊鐨勶紝杩樻湁钃濈墮鐨勶紝杩樻湁鍠濆鐨勩\u20ac傝繖浜涢兘鏄渶瑕佽姳閽变拱鐨勫晩","shop_ListingTime":"1563779867","shop_title":"闊冲搷","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/k.jpg"},{"shop_content":"鑰虫満杩欎釜鏄皬鍝ュ摜灏忓濮愬钩鏃朵笂璇炬椂涓嶆兂鍚鐨勬渶浣充笉鍚鐗╁搧锛屽洜涓哄甫涓婅\u20ac虫満浠ュ悗灏卞彲浠ュ惉涓嶈鑰佸笀璇磋瘽锛岃繖鏍锋槸涓嶅ソ鐨勶紝鎵\u20ac浠ヨ瀹炶鏄笉鍏佽甯﹁\u20ac虫満鐨�","shop_ListingTime":"1563779867","shop_title":"鑰虫満","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/e.jpg"}]
     */

    private String code;
    private String message;
    private List<GgBeanBean> ggBean;
    private List<HxListBeansBean> hxListBeans;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<GgBeanBean> getGgBean() {
        return ggBean;
    }

    public void setGgBean(List<GgBeanBean> ggBean) {
        this.ggBean = ggBean;
    }

    public List<HxListBeansBean> getHxListBeans() {
        return hxListBeans;
    }

    public void setHxListBeans(List<HxListBeansBean> hxListBeans) {
        this.hxListBeans = hxListBeans;
    }

    public static class GgBeanBean {
        /**
         * ggIma_url : http://106.13.63.54:8080/sys/image/o.jpg
         * gg_title : 杩欐槸绗竴寮犲浘
         * ggWeb_url : http://106.13.63.54:8080/sys/xxx.html
         */

        private String ggIma_url;
        private String gg_title;
        private String ggWeb_url;

        public String getGgIma_url() {
            return ggIma_url;
        }

        public void setGgIma_url(String ggIma_url) {
            this.ggIma_url = ggIma_url;
        }

        public String getGg_title() {
            return gg_title;
        }

        public void setGg_title(String gg_title) {
            this.gg_title = gg_title;
        }

        public String getGgWeb_url() {
            return ggWeb_url;
        }

        public void setGgWeb_url(String ggWeb_url) {
            this.ggWeb_url = ggWeb_url;
        }
    }

    public static class HxListBeansBean implements Serializable{
        /**
         * shop_content : 杩欐槸涓€涓數鍚归锛屾礂瀹屽ご鍙戯紝鍙互鍚瑰共澶村彂锛岀櫧澶╃敤锛屾櫄涓婄敤锛屼粈涔堥€傚悎閮藉彲浠ョ敤锛岃€屼笖杩樹究瀹溿€備富瑕佹槸鑰佸皯鐨嗗疁鍟�
         * shop_ListingTime : 1563779867
         * shop_title : 鐢靛惞椋�
         * shop_pirce : 3.45
         * shop_image_url : http://106.13.63.54:8080/sys/image/l.jpg
         */

        private String shop_content;
        private String shop_ListingTime;
        private String shop_title;
        private String shop_pirce;
        private String shop_image_url;

        public String getShop_content() {
            return shop_content;
        }

        public void setShop_content(String shop_content) {
            this.shop_content = shop_content;
        }

        public String getShop_ListingTime() {
            return shop_ListingTime;
        }

        public void setShop_ListingTime(String shop_ListingTime) {
            this.shop_ListingTime = shop_ListingTime;
        }

        public String getShop_title() {
            return shop_title;
        }

        public void setShop_title(String shop_title) {
            this.shop_title = shop_title;
        }

        public String getShop_pirce() {
            return shop_pirce;
        }

        public void setShop_pirce(String shop_pirce) {
            this.shop_pirce = shop_pirce;
        }

        public String getShop_image_url() {
            return shop_image_url;
        }

        public void setShop_image_url(String shop_image_url) {
            this.shop_image_url = shop_image_url;
        }
    }
}
