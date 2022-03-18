package com.onboarding.currencycalculation.model;

import java.math.BigDecimal;

public class CalculatedAmount {

		private Long id;
		private String from;
		private String to;
		private BigDecimal multiplicationFactor;
		private String quantity;
		private BigDecimal TotalCalculatedAmount;
		private int port;
		
		public CalculatedAmount() {
			
		}

		public CalculatedAmount(Long id, String from, String to, BigDecimal multiplicationFactor, String quantity,
				BigDecimal totalCalculatedAmount, int port) {
			super();
			this.id = id;
			this.from = from;
			this.to = to;
			this.multiplicationFactor = multiplicationFactor;
			this.quantity = quantity;
			TotalCalculatedAmount = totalCalculatedAmount;
			this.port = port;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public BigDecimal getMultiplicationFactor() {
			return multiplicationFactor;
		}

		public void setMultiplicationFactor(BigDecimal multiplicationFactor) {
			this.multiplicationFactor = multiplicationFactor;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public BigDecimal getTotalCalculatedAmount() {
			return TotalCalculatedAmount;
		}

		public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
			TotalCalculatedAmount = totalCalculatedAmount;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		@Override
		public String toString() {
			return "CalculatedAmount [id=" + id + ", from=" + from + ", to=" + to + ", multiplicationFactor="
					+ multiplicationFactor + ", quantity=" + quantity + ", TotalCalculatedAmount="
					+ TotalCalculatedAmount + ", port=" + port + "]";
		}
		
}
