package com.lms.springboot.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tbl_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message="图书名称不能为空！")
    @Column(length = 20)
    private String name;

    @NotNull(message="单价不能为空！")
    @Column(precision = 5, scale = 2) //小数点前面5位 后面2位
    private BigDecimal price; //不用double

    @NotNull(message="序号不能为空！")
    @Column(length = 10)
    private Integer orderNo;

    @NotEmpty(message="作者不能为空！")
    @Column(length=20)
    private String author; //作者

    @NotEmpty(message="出版社不能为空！")
    @Column(length=20)
    private String press; //出版社

    @Column(length=200)
    private  String imageUrl;//图书封面


    @NotNull(message="图书数量不能为空！")
    @Column(length=10)
    private Integer num;//图书数量

    @ManyToOne    //多对一
    @JoinColumn(name="bookTypeId")
    private BookType bookType; // 图书类型

    @Temporal(TemporalType.TIME)
    private Date createDateTime;

    @Temporal(TemporalType.TIME)
    private Date updateDateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
