package example;
 
import java.util.List;
import java.util.ArrayList;
 
/**
 * @author Grady
 */
public class MidLayer {
    public List getHouseList(Criterion c) {
    	System.out.println("Java Check Point 1");
 
        //���L��@�{���X
        //....
        //��ڤW���ӬO�̿z�����
        //�q��Ʈw���o����
        //�b�o�̥��⪫���ƶ�n
 
        List<House> result = new ArrayList<House>();
 
        //javascript�Ƕi�Ӫ��Ѽ�
        //�����H���󫬺A�ϥ�
        //�Ҧp c.getAreaId()
        
        /*
        House h1 = new House();
        House h2 = new House();
        
        h1.setId(1L);
        h1.setAddress("�x�_�� �����F��");
        h1.setImgUrl("house1.jpg");
        h1.setPrice(1000000D);
        h1.setSize(40D);

        h2.setId(2L);
        h2.setAddress("�x�_�� ���s�_��");
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
            h1.setAddress("�x�_�� �����F��");
            h1.setImgUrl("house1.jpg");
            h1.setPrice(1000000D);
            h1.setSize(40D);
 
            h2.setId(2L);
            h2.setAddress("�x�_�� ���s�_��");
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
 
            //���L��@�{���X
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