package site.metacoding.miniproject1.domain.subcribes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Subscribes {
	private Integer id;
	private Integer userId;
	private Integer companyId;
	private Timestamp created;
}
