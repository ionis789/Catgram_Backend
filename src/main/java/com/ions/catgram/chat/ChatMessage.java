package com.ions.catgram.chat;

import lombok.*;


@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public String getSender() {
        return sender;
    }

}
