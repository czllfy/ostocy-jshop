package com.jshop.android.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
	
	//数据库名称
	public static final String DB_NAME="jshopmactive.db";
	//餐桌
	public static final String TABLE_TM_NAME="table_tm";
	//商品分类表名称
	public static final String GOODS_CATEGORY_TM_NAME="goods_category_tm";
	//商品表名称
	public static final String GOODS_TM_NAME="goods_tm";
	
	//创建餐桌sql
	private static final String CREATE_TABLE_TM="create table "
		+"table_tm(_id integer primary key autoincrement,tableid text,tableNumber text,roomName text,androidDevicesCount text,note text,createtime text,nop text,tablestate text,floor text,rnop text)";
	
	//创建商品分类sql
	private static final String CREATE_GOODS_CATEGORY_TM="create table "
		+"goods_category_tm(_id integer primary key autoincrement,goodsCategoryTid text,grade text,name text,goodsTypeId text,sort text)";
	//创建商品sql
	private static final String CREATE_GOODS_TM="create table "
		+"goods_tm(_id integer primary key autoincrement,goodsCategoryTid text,goodsid text,goodsname text,memberprice text,pictureurl text)";
	
	
	private SQLiteDatabase db;
	
	
	
	public DBHelper(Context context) {
		super(context, DB_NAME, null, 3);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		this.db=db;
		db.execSQL(CREATE_TABLE_TM);
		db.execSQL(CREATE_GOODS_CATEGORY_TM);
		db.execSQL(CREATE_GOODS_TM);
	}

	public void createDB(){
		db=this.getWritableDatabase();
		db.execSQL(CREATE_TABLE_TM);
		db.execSQL(CREATE_GOODS_CATEGORY_TM);
		db.execSQL(CREATE_GOODS_TM);
	}
	
	
	/**
	 * 插入数据
	 * @param values
	 * @param tablename
	 */
	public void insert(String tablename,ContentValues values){
		SQLiteDatabase db=this.getWritableDatabase();
		db.insert(tablename, null, values);
		db.close();
	}
	
	/**
	 * 查询数据
	 * @param tablename
	 * @return
	 */
	public Cursor query(String tablename){
		SQLiteDatabase db=this.getWritableDatabase();
		Cursor c=db.query(tablename, null, null, null, null, null, null);
		return c;
	}
	
	/**
	 * 查询数据
	 * @param tablename
	 * @return
	 */
	public Cursor queryByParam(String tablename,String param){
		SQLiteDatabase db=this.getWritableDatabase();
		Cursor c=db.rawQuery("select * from "+tablename+" where goodsCategoryTid=?", new String[]{String.valueOf(param)}); 
		return c;
	}
	
	/**
	 * 删除数据
	 * @param talbename
	 * @param id
	 */
	public void delete(String talbename,String id){
		if(db==null){
			db=this.getWritableDatabase();
			db.delete(talbename, "_id=?", new String[]{String.valueOf(id)});
		}
	}
	/**
	 * 删除所有数据
	 * @param tablename
	 */
	public void deleteAll(String tablename){
		if(db==null){
			db=this.getWritableDatabase();
			db.delete(tablename, null, null);
		}
	}
	
	/**
	 * 删除数据库表
	 * @param tablename
	 */
	public void DropTable(String tablename){
		db=this.getWritableDatabase();
		db.execSQL("drop table "+tablename);
	}
	/**
	 * 删除数据库
	 * @param tablename
	 */
	public void DropDB(){
		db=this.getWritableDatabase();
//		db.execSQL("drop database jshopmactive");
		onUpgrade(db,3,4);
	}
	
	/**
	 * 关闭数据库连接
	 */
	public void close(){
		if(db!=null){
			db.close();
		}
	}
	
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_TM_NAME);
		db.execSQL("DROP TABLE IF EXISTS "+GOODS_CATEGORY_TM_NAME);
		db.execSQL("DROP TABLE IF EXISTS "+GOODS_TM_NAME);
        onCreate(db);
	}

}
