package br.com.db1.db1start.aula18;

public enum Operaçao {

	SOMA {
		@Override
		public Integer executa(Integer num1, Integer num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Integer executa(Integer num1, Integer num2) {
			return num1 - num2;
		}
	},
	DIVISAO {
		@Override
		public Integer executa(Integer num1, Integer num2) {
			return num1 / num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Integer executa(Integer num1, Integer num2) {
			return (num1 * num2);
		}
	};

	public abstract Integer executa(Integer num1, Integer num2);

}
