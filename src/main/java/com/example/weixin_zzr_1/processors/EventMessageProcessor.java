package com.example.weixin_zzr_1.processors;

import com.example.weixin_zzr_1.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
