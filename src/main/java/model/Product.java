package model;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;

@Entity(name="products")
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name; // O nome do produto

    private String description; // A descrição do produto

    private double price; // O preço do produto

    private String category; // A categoria à qual o produto pertence

}