<?xml version="1.0"?>
<#import "root://activities/common/kotlin_macros.ftl" as kt>
<recipe>
    <#include "../common/recipe_manifest.xml.ftl" />
    <@kt.addAllKotlinDependencies />

<#if generateLayout>
    <#include "../common/recipe_simple.xml.ftl" />
    <open file="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" />
</#if>

	<instantiate from="root/src/app_package/MVPActivity.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/${activityClass}.java" />
				   
	<open file="${escapeXmlAttribute(srcOut)}/${activityClass}.java" />
	
	<instantiate from="root/src/app_package/MVPInterface.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/${mvpInterface}.java" />
				   
	<instantiate from="root/src/app_package/MVPPresenter.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/${presenterClass}.java" />
				   
</recipe>
