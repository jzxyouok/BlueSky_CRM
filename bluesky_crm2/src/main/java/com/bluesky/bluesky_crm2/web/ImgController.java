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
 * ��֤��
 * @author ������ 
 * @date 2016��7��3��
 */
@Controller
public class ImgController {
	
	//������ֵ���֤����Դ
	String str = "023456789abcdefghjk";
	//�����������
	Random rd= new Random();
	@RequestMapping(value="/Img",method=RequestMethod.GET)
	public void Imgl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("��֤��");
		//������ɵ���֤��
		String code = randomCode();
		//����֤�뱣����session������
		request.getSession().setAttribute("code", code); 
		int width =60;//��
		int height = 25;//��
		//����ͼƬ����
		BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		//��û��ƶ���
		Graphics g= img.getGraphics();
		//��ñ���ɫ��ǰ��ɫ
		Color back = randomBgColor();
		Color front = randomFtColor(back);
		//����ͼ�񱳾�
		g.setColor(back); 
		g.fillRect(0, 0, width, height); 
		//ʹ��ǰ��ɫ��������֤��
		g.setColor(front);
		g.setFont(new Font("����", Font.PLAIN, 30));
		for(int i = 0;i<code.length();i++){
			char c=  code.charAt(i);
			g.drawString(c+"", 12*i+5, 25);
		}
		ServletOutputStream  out = response.getOutputStream();
		// ��������ͼ����JPEG�ĸ�ʽд�������
		ImageIO.write(img, "JPEG", out);
		out.flush();
	}
	
	//��������ַ���
	private String randomCode(){
		String code = "";
		//�����֤��
		for(int i =0;i<4;i++){
			int index = rd.nextInt(str.length());
			code+=str.charAt(index);
		}
		return code;
		
	}
	//������ɱ���ɫ RGB
	private Color randomBgColor(){  
		int r = 255-rd.nextInt(128);
		int g = 255-rd.nextInt(128);
		int b = 255-rd.nextInt(128);
		return new Color(r,g,b);
	}
	
	//�������ǰ��ɫ
	private Color randomFtColor(Color back){  
		int r = rd.nextInt(255-back.getRed());
		int g = rd.nextInt(255-back.getGreen());
		int b = rd.nextInt(255-back.getBlue());
		return new Color(r,g,b);
	}
}
