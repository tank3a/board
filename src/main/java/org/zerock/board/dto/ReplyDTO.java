package org.zerock.board.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReplyDTO {

    private Long rno;

    private String text;

    private String replier;

    private Long bno;

    private LocalDateTime regDate, modDate;
}
