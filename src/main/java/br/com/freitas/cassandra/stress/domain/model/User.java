package br.com.freitas.cassandra.stress.domain.model;

import com.datastax.driver.core.DataType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Data
@Table("tb_user")
public class User {
    @EqualsAndHashCode.Include
    @PrimaryKey
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;

    @Column("name")
    private String name;

    @Column(value = "gender")
    private String gender;

    @Column(value = "birthday")
    private Date birthday;

    @Column(value = "city")
    private String city;
}