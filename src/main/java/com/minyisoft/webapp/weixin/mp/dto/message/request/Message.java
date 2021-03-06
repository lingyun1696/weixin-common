package com.minyisoft.webapp.weixin.mp.dto.message.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qingyong_ou 消息接收基类对象
 */
@Getter
@Setter
public abstract class Message {
	/**
	 * 开发者微信号
	 */
	private String toUserName;
	/**
	 * 发送方帐号（一个OpenID）
	 */
	private String fromUserName;
	/**
	 * 消息创建时间 （整型）
	 */
	private Date createTime;
	/**
	 * MsgType
	 */
	private MessageType msgType;
}
