package br.com.db1.calculadoraapi.calculadora_api.model;

public enum OperacaoMatematica {
	SOMA {
		@Override
		public Integer executar(Integer num1, Integer num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Integer executar(Integer num1, Integer num2) {
			return num1 - num2;
		}
	},
	DIVISAO {
		@Override
		public Integer executar(Integer num1, Integer num2) {
			return num1 / num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Integer executar(Integer num1, Integer num2) {
			return num1 * num2;
		}
	};

	public abstract Integer executar(Integer num1, Integer num2);

}
