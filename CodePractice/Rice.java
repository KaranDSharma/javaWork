{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf470
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
public class Rice\
\{\
	\
	private int numOfRegions;\
\
			\
	public void arrayStore(String[] args)\
	\{\
		Int arrayOfSum[] = new Int[numOfRegions];\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 		\
		for (int i = 0; i < arrayOfSum.length; i++) \
			\{\
			\
			System.out.print("Enter the sum of rice of: " + (i+1) + " : ");\
			\
		     	   arrayOfSum[i] = scan.nextLine();\
		   	 \}   \
	\}\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 	\
		\
	public void showRegion()\
	\{\
		for (int i = 0; i < arrayOfSum.length; i++) \
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 			\{\
			\
			System.out.print("This Region " + (i+1) + " : ");\
			\
		        System.out.print(arrayOfSum[i] + "\\n");    \
		     \}\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
	\}\
	\
	public int getRegions()\
	\{\
		return numOfRegions;\
	\}\
\
	public int calculateLargest()\
	\{\
		int max = arrayOfSum[0];\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
		for (int i = 1; i < arrayOfSum.length; i++) \
		\{\
			if (arrayOfSum[i] > max) max = arrayOfSum[i];\
\
		\}\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 	\}\
	\
	public int calculateSum()\
	\{\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 		int total = 0;\
\
		for (int i = 0; i < arrayOfSum.length; i++) \
		\{\
			total += arrayOfSum[i];\
\
		\}\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 	\}\
		\
\}\
\
}