/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.keyframe;


import com.eliotlash.molang.ast.Evaluatable;
import com.eliotlash.molang.ast.Expr;

public class BoneAnimation
{
	public String boneName;
	public VectorKeyFrameList<KeyFrame<Evaluatable>> rotationKeyFrames;
	public VectorKeyFrameList<KeyFrame<Evaluatable>> positionKeyFrames;
	public VectorKeyFrameList<KeyFrame<Evaluatable>> scaleKeyFrames;
}
