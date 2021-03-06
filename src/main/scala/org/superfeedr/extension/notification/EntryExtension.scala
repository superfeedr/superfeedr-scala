package org.superfeedr.extension.notification

import java.util.Date

case class EntryExtension(id:String, links:List[EntryLink], published:Date, updated:Date, summary:String, title:String, content:String) extends DefaultSuperfeedrExtension

case class EntryLink(href:String, rel:String = "", linkType:String = "", title:String = "")