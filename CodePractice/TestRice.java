{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
\
\
public class TestRice \
\{\
	public static void main(String [] args)\
	\{\
		\
		int regions;\
		\
		Scanner  reg = new Scanner( System.in );\
\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 		System.out.print("Enter how many regions: ");\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 		length = reg.nextInt();\
				\
		Rice r1 = new Rice();\
		\
		System.out.println("\\nThe sum of the regions rice:  " + r1.calculateSum());\
		System.out.println("\\nThe number of regions: \'93 + r1.getRegions());\
		System.out.println("\\nThe largest value: \'93 + r1.calculateLargest());	\
\
	\}\
\}\
}