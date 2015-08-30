package example;
 
/**
 * @author Grady
 */
public class House {
 
    public House() {
    }
 
    private Long id;
    private String address;
    private String imgUrl;
    private Double price;
    private Double size;
 
    public Double getSize() {
        return size;
    }
 
    public void setSize(Double size) {
        this.size = size;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getImgUrl() {
        return imgUrl;
    }
 
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
 
    public Double getPrice() {
        return price;
    }
 
    public void setPrice(Double price) {
        this.price = price;
    }
 
}