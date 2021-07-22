package com.gdufe.JavaSpringBootTest.Bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("course")
public class Course {
    private int id;
    private String cname;
    private int daySale;
    private int monthSale;
    private int totalSale;
    private String description;
    private float price;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", daySale=" + daySale +
                ", monthSale=" + monthSale +
                ", totalSale=" + totalSale +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
