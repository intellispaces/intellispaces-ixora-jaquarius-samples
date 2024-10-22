package intellispaces.samples.rdb;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Domain;
import intellispaces.ixora.rdb.annotation.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "book", name = "book")
@Domain("f80a3457-66ad-42c9-8372-715a9f7dd5f4")
public interface BookDomain {

  @Id
  @Column(name = "id")
  @Channel("eb7f9644-760c-4d77-bc04-d83014160569")
  Integer id();

  @Column(name = "title")
  @Channel("22319064-8b93-491e-bf62-51e64e399ff6")
  String title();

  @Column(name = "author")
  @Channel("cdc59a3f-f3e4-4fb0-8f9a-7df0131b10db")
  String author();

  @Column(name = "genre")
  @Channel("efb771a4-c257-465f-bed9-e324bb4345c3")
  String genre();
}
