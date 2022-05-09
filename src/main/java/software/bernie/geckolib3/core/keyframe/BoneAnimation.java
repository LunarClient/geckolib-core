/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.keyframe;


import com.eliotlash.molang.ast.Expr;

public class BoneAnimation
{
	public String boneName;
	public VectorKeyFrameList<KeyFrame<Expr>> rotationKeyFrames;
	public VectorKeyFrameList<KeyFrame<Expr>> positionKeyFrames;
	public VectorKeyFrameList<KeyFrame<Expr>> scaleKeyFrames;
}
