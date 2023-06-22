package com.scotiainterview.springbootBackend.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scotia")
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class TODO
{
    @Id
    @Getter
    @Setter
    private String _id;

    @Getter
    @Setter
    private String noteTitle;

    @Getter
    @Setter
    private String noteContent;

    @Getter
    @Setter
    private int lane;

    @Override
    public String toString() {
        return "TODO{" +
                "_id='" + _id + '\'' +
                ", noteTitle='" + noteTitle + '\'' +
                ", noteContent='" + noteContent + '\'' +
                ", lane=" + lane +
                '}';
    }
}
