package com.model;

public class Faq {

		private int qno;
		private String question;
		private String answer;
		
		
		/*
		 * Parameterlized constructer
		 * */
		
		public Faq(int qno, String question, String answer) {
			super();
			this.qno = qno;
			this.question = question;
			this.answer = answer;
		}

		
		/*
		 * overloaded constructer
		 */
		public Faq(String question, String answer) {
			super();
			this.question = question;
			this.answer = answer;
		}


		/*
		 * getters
		 */

		public int getQno() {
			return qno;
		}

		public String getQuestion() {
			return question;
		}

		public String getAnswer() {
			return answer;
		}

		
		/*
		 * setters
		 */


		public void setQno(int qno) {
			this.qno = qno;
		}



		public void setQuestion(String question) {
			this.question = question;
		}



		public void setAnswer(String answer) {
			this.answer = answer;
		}
		
		
		
		
	
}
