package jp.live2d.sample;

public final class JniBridge {
	static {
		System.loadLibrary("Live2DSimple");
	}

	public static native void nativeOnCreate(String assetsPath);
	public static native void nativeOnSurfaceCreated();
	public static native void nativeOnSurfaceChanged(int width, int height);
	public static native void nativeOnDrawFrame();
}
