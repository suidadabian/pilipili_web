package com.pilipili.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("comment", "id", Comment.class);
		arp.addMapping("infopicture", "id", InfoPicture.class);
		arp.addMapping("lightpicture", "id", LightPicture.class);
		arp.addMapping("reply", "id", Reply.class);
		arp.addMapping("user", "id", User.class);
	}
}

