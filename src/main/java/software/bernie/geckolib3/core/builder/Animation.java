/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.builder;

import com.eliotlash.molang.ast.Evaluatable;
import software.bernie.geckolib3.core.keyframe.BoneAnimation;
import software.bernie.geckolib3.core.keyframe.EventKeyFrame;
import software.bernie.geckolib3.core.keyframe.ParticleEventKeyFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A specific animation instance
 */
public class Animation
{
	public String animationName;
	public Double animationLength;
	public boolean loop = true;
	public Map<String, BoneAnimation> boneAnimations;
	public List<EventKeyFrame<String>> soundKeyFrames = new ArrayList<>();
	public List<ParticleEventKeyFrame> particleKeyFrames = new ArrayList<>();
	public List<EventKeyFrame<Evaluatable>> customInstructionKeyframes = new ArrayList<>();

}
