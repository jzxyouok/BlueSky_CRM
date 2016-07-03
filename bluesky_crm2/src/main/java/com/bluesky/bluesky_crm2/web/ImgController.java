package com.bluesky.bluesky_crm2.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 验证码
 * @author 刘光岳 
 * @date 2016年7月3日
 */
@Controller
public class ImgController {
	
	//随机出现的验证码资源
	String str = "023456789abcdefghjk";
	//创建随机对象
	Random rd= new Random();
	@RequestMapping(value="/Img",method=RequestMethod.GET)
	public void Imgl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("验证码");
		//获得生成的验证码
		String code = randomCode();
		//将验证码保存在session对象中
		request.getSession().setAttribute("code", code); 
		int width =60;//长
		int height = 25;//宽
		//创建图片对象
		BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		//获得绘制对象
		Graphics g= img.getGraphics();
		//获得背景色和前景色
		Color back = randomBgColor();
		Color front = randomFtColor(back);
		//绘制图像背景
		g.setColor(back); 
		g.fillRect(0, 0, width, height); 
		//使用前景色来绘制验证码
		g.setColor(front);
		g.setFont(new Font("宋体", Font.PLAIN, 30));
		for(int i = 0;i<code.length();i++){
			char c=  code.charAt(i);
			g.drawString(c+"", 12*i+5, 25);
		}
		ServletOutputStream  out = response.getOutputStream();
		// 将缓存区图像以JPEG的格式写入输出流
		ImageIO.write(img, "JPEG", out);
		out.flush();
	}
	
	//随机生成字符串
	private String randomCode(){
		String code = "";
		//随机验证码
		for(int i =0;i<4;i++){
			int index = rd.nextInt(str.length());
			code+=str.charAt(index);
		}
		return code;
		
	}
	//随机生成背景色 RGB
	private Color randomBgColor(){  
		int r = 255-rd.nextInt(128);
		int g = 255-rd.nextInt(128);
		int b = 255-rd.nextInt(128);
		return new Color(r,g,b);
	}
	
	//随机生成前景色
	private Color randomFtColor(Color back){  
		int r = rd.nextInt(255-back.getRed());
		int g = rd.nextInt(255-back.getGreen());
		int b = rd.nextInt(255-back.getBlue());
		return new Color(r,g,b);
	}
}
