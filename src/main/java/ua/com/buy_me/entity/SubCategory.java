package ua.com.buy_me.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by koko on 14.10.16.
 */
@Entity
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @OneToMany(mappedBy = "subCategory",fetch = FetchType.LAZY)
    private List<Commodity>commodities;

    public SubCategory() {
    }

    public SubCategory(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    @Override
    public String toString() {
        return "SubCategoryRepository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
