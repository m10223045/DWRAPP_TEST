package example;
 
import java.util.List;
import java.util.ArrayList;
 
/**
 * @author Grady
 */
public class MidLayer {
    public List getHouseList(Criterion c) {
    	System.out.println("Java Check Point 1");
 
        //略過實作程式碼
        //....
        //實際上應該是依篩選條件
        //從資料庫取得物件
        //在這裡先把物件資料填好
 
        List<House> result = new ArrayList<House>();
 
        //javascript傳進來的參數
        //直接以物件型態使用
        //例如 c.getAreaId()
        
        /*
        House h1 = new House();
        House h2 = new House();
        
        h1.setId(1L);
        h1.setAddress("台北市 忠孝東路");
        h1.setImgUrl("house1.jpg");
        h1.setPrice(1000000D);
        h1.setSize(40D);

        h2.setId(2L);
        h2.setAddress("台北市 中山北路");
        h2.setImgUrl("house2.jpg");
        h2.setPrice(2000000D);
        h2.setSize(60D);

        result.add(h1);
        result.add(h2);
        */
        
 
        if (c.getAreaId().equals(1)) {
            House h1 = new House();
            House h2 = new House();
 
            h1.setId(1L);
            h1.setAddress("台北市 忠孝東路");
            h1.setImgUrl("house1.jpg");
            h1.setPrice(1000000D);
            h1.setSize(40D);
 
            h2.setId(2L);
            h2.setAddress("台北市 中山北路");
            h2.setImgUrl("house2.jpg");
            h2.setPrice(2000000D);
            h2.setSize(60D);
 
            result.add(h1);
            result.add(h2);
        }
        else if (c.getAreaId().equals(2)) {
 
        }
        else {
            House h3 = new House();
            House h4 = new House();
            House h5 = new House();
 
            //略過實作程式碼
            //......
 
            result.add(h3);
            result.add(h4);
            result.add(h5);
        }
        System.out.println("Java Check Point 2");
        System.out.println("result: " + result.toString());
 
        return result;
    }
}