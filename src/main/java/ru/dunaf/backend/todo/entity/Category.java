package ru.dunaf.backend.todo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "category", schema = "todolist", catalog = "postgres")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Category {

    private String title;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    @Column(updatable = false)
    private Long completedCount;

    @Column(updatable = false)
    private Long uncompletedCount;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable=false, updatable=false)
//    private User user;

    @Override
    public String toString() {
        return title;
    }
}
