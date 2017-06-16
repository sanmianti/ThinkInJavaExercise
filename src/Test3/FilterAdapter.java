package Test3;

import test2.MProcessor;

public class FilterAdapter implements MProcessor{

	Filter filter;
	public FilterAdapter(Filter filter) {
		// TODO Auto-generated constructor stub
		this.filter = filter;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}
	@Override
	public WaveForm process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((WaveForm)input);
	}
}
