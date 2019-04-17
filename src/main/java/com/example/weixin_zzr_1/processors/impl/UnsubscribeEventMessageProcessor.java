package com.example.weixin_zzr_1.processors.impl;

import com.example.weixin_zzr_1.domain.event.EventInMessage;
import com.example.weixin_zzr_1.processors.EventMessageProcessor;
import org.springframework.stereotype.Service;

@Service("unsubscribeMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	@Override
	public void onMessage(EventInMessage msg) {
		// 把用户的数据删除，或者标记为已经取消关注即可
	}
}
