package com.adviser.campaign.webkit.listener

/**
 * Created by Kairos on 2017. 6. 7..
 */
interface OnCustomJavascriptListener {
  fun getImageURL() : String
  fun checkDontWatchDay()
  fun close()
}