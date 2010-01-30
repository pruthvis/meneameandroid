package com.dcg.meneame;

import java.net.URL;
import java.util.ArrayList;

public class Article extends Object {
	// Database related stuff (in case we use the DB as main storage)
	public int mArticleID;
	public int mFeedID;
	
	// RSS Item data
	public String mTitle;
	public String mDescription;
	public URL mMeneameLink;
	public URL mLink;
	public String mCreator;
	public String mPubDate;
	public ArrayList<String> mTags;
	public String mCommentsFeed;
	public int mComments;
}
